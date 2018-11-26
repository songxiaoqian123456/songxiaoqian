package com.edu.javamail;

import java.util.Date;
import java.util.Properties;

import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.mail.internet.MimeUtility;

import org.testng.annotations.Test;

public class javamaildemo {
	@Test
	public void  testjavamail() throws Exception{
		//�ռ�������
		String to = "2539301866@qq.com";
		//����������
		String from = "songxiaoqian1998@126.com";
		//����
		String server="songxiaoqian1998@126.com";
		//��Ȩ��
		String auth_code="sxq123456";
		Properties properties=new Properties();
		properties.setProperty("mail.transport.protocol", "smtp");
		properties.setProperty("mail.smtp.host", "smtp.126.com");
		properties.setProperty("mail.smtp.auth", "true");
		Session session=Session.getInstance(properties);
		session.setDebug(true);
		Message message=new MimeMessage(session);
		// Set From: ͷ��ͷ�ֶ�
		message.setFrom(new InternetAddress(from));
		// Set To: ͷ��ͷ�ֶ�
		message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
		// Set Subject: ͷ�ֶ�
		message.setSubject("This is the SUbject Line!");
		// ������Ϣ��
		message.setText("hello world");
		// ������Ϣ
		Transport transport=session.getTransport();
		transport.connect(server,auth_code);
		transport.sendMessage(message, message.getAllRecipients());
		System.out.println("Sent message successfully");
		transport.close();
		
	}	
		
}
