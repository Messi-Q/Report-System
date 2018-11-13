package test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.Font;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.BaseFont;
import com.lowagie.text.pdf.PdfWriter;

public class PDFCreateFile {

	/*
	 * 创建一份PDF文档
	 */
	public boolean createPDFFiles(String fullFilePath) {
		Document pdfDocument = new Document();
		try {
			// 构建pdf文档输出过程
			OutputStream pdfFileOutputStream = new FileOutputStream(new File(fullFilePath));
			PdfWriter pdfWriter = PdfWriter.getInstance(pdfDocument, pdfFileOutputStream);
			// PDF版本(默认1.4)
			pdfWriter.setPdfVersion(PdfWriter.PDF_VERSION_1_4);
			// 文档属性
			pdfDocument.addTitle(" ");
			pdfDocument.addAuthor(" ");
			pdfDocument.addSubject(" ");
			pdfDocument.addKeywords(" ");// 文档关键字信息
			pdfDocument.addCreator(" ");// 应用程序名称
			// 只读
			pdfWriter.setEncryption(null, null, PdfWriter.ALLOW_PRINTING, PdfWriter.STANDARD_ENCRYPTION_128);

			// 设置中文字体和字体样式
			BaseFont bfChinese = BaseFont.createFont("STSong-Light", "UniGB-UCS2-H", BaseFont.NOT_EMBEDDED);
			Font f2 = new Font(bfChinese, 2, Font.NORMAL);
			Font f6 = new Font(bfChinese, 6, Font.NORMAL);
			Font f10 = new Font(bfChinese, 10, Font.NORMAL);
			Font f12 = new Font(bfChinese, 12, Font.BOLD);
			// 打开PDF文件流
			pdfDocument.open();
			// 设置PDF文件正文内容
			pdfDocument.add(new Paragraph("中国程序员周报", f12));
			// 换行
			pdfDocument.add(new Paragraph(" ", f6));
			// 换行
			pdfDocument.add(new Paragraph("中国程序员工作时间调查报告", f10));
			// 换行
			pdfDocument.add(new Paragraph(" ", f2));
			return true;

		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("pdf file:" + e.getMessage());
			return false;
		} catch (DocumentException de) {
			de.printStackTrace();
			System.err.println("document:" + de.getMessage());
			return false;
		} catch (IOException ie) {
			ie.printStackTrace();
			System.out.println("pdf font:" + ie.getMessage());
			return false;
		} finally {
			// 关闭PDF文档流，OutputStream文件输出流也将在PDF文档流关闭方法内部关闭
			if (pdfDocument != null) {
				pdfDocument.close();
			}
		}
	}

	public static void main(String[] args) {
		PDFCreateFile createFile = new PDFCreateFile();
		long startTime = System.currentTimeMillis();
		boolean result = createFile.createPDFFiles("E:/hello.pdf");
		long endTime = System.currentTimeMillis();
		System.out.println("pdf文档创建结果：" + result + "\n" + "花费时间：" + (endTime - startTime));
	}

}
