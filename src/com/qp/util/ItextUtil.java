package com.qp.util;

import java.awt.Color;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.Element;
import com.lowagie.text.Font;
import com.lowagie.text.FontFactory;
import com.lowagie.text.Image;
import com.lowagie.text.PageSize;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.BaseFont;
import com.lowagie.text.pdf.PdfWriter;
import com.lowagie.text.rtf.RtfWriter2;
import com.qp.entity.Report;

/**
 * IText操作类
 * 
 * @author Messi
 *
 */
public class ItextUtil {

	private Font font;
	private BaseFont bfChinese;

	public ItextUtil() throws Exception {
		// 设置中文字体
		bfChinese = BaseFont.createFont("STSong-Light", "UniGB-UCS2-H", BaseFont.NOT_EMBEDDED);
		font = new Font(bfChinese);
		font.setSize(15);
		font.setStyle(FontFactory.HELVETICA);
		font.setStyle(Font.BOLD);// 加粗
		font.setColor(new Color(0, 0, 0));

	}

	public static ItextUtil getInstance() throws Exception {
		return new ItextUtil();
	}

	public boolean createRtfContext(List<Report> reportList, List<String> imgList, OutputStream out, String type) {
		Document doc = new Document(PageSize.A4, 20, 20, 20, 20);
		try {
			if ("word".equals(type)) {
				RtfWriter2.getInstance(doc, out);
			} else if ("pdf".equals(type)) {
				PdfWriter.getInstance(doc, out);
			}
			doc.open();
			Report report = null;
			Paragraph title1 = null;
			for (int i = 0; i < reportList.size(); i++) {
				report = reportList.get(i);
				// 标题
				Paragraph title = new Paragraph(report.getReportTitle(), font);
				title.setAlignment(Element.ALIGN_LEFT);
				doc.add(title);

				// 换行
				title1 = new Paragraph("\n");
				doc.add(title1);

				// 上周任务
				Paragraph content = new Paragraph(report.getLastReportCont(), font);
				content.setAlignment(Element.ALIGN_LEFT);
				doc.add(content);

				// 换行
				title1 = new Paragraph("\n");
				doc.add(title1);

				// 本周进度
				Paragraph site = new Paragraph(report.getThisReportCont(), font);
				content.setAlignment(Element.ALIGN_LEFT);
				doc.add(site);

				// 换行
				title1 = new Paragraph("\n");
				doc.add(title1);

				// 下周计划
				Paragraph publishTime = new Paragraph(report.getNextReportCont(), font);
				content.setAlignment(Element.ALIGN_LEFT);
				doc.add(publishTime);

				// 换行
				title1 = new Paragraph("\n");
				doc.add(title1);

			}

			Image img = null;
			for (int j = 0; j < imgList.size(); j++) {
				// 图片
				img = Image.getInstance(imgList.get(j));
				float heigth = img.getHeight();
				float width = img.getWidth();
				int percent = getPercent2(heigth, width);
				img.setAlignment(Image.MIDDLE);
				img.scalePercent(percent + 3);// 表示是原来图像的比例;
				doc.add(img);
			}

			doc.close();
			return true;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			return false;
		} catch (DocumentException e) {
			e.printStackTrace();
			return false;
		} catch (IOException e) {
			e.printStackTrace();
			return false;
		} finally {
			// 关闭PDF文档流，OutputStream文件输出流也将在PDF文档流关闭方法内部关闭
			if (doc != null) {
				doc.close();
			}
		}
	}

	/**
	 * 第一种解决方案 在不改变图片形状的同时，判断，如果h>w，则按h压缩，否则在w>h或w=h的情况下，按宽度压缩
	 * 
	 * @param h
	 * @param w
	 * @return
	 */

	public static int getPercent(float h, float w) {
		int p = 0;
		float p2 = 0.0f;
		if (h > w) {
			p2 = 297 / h * 100;
		} else {
			p2 = 210 / w * 100;
		}
		p = Math.round(p2);
		return p;
	}

	/**
	 * 第二种解决方案，统一按照宽度压缩 这样来的效果是，所有图片的宽度是相等的，自我认为给客户的效果是最好的
	 * 
	 * @param args
	 */
	public static int getPercent2(float h, float w) {
		int p = 0;
		float p2 = 0.0f;
		p2 = 530 / w * 100;
		p = Math.round(p2);
		return p;
	}
}
