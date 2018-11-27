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
		//收件人邮箱
		String to = "2539301866@qq.com";
		//发件人邮箱
		String from = "songxiaoqian1998@126.com";
		//邮箱
		String server="songxiaoqian1998@126.com";
		//授权码
		String auth_code="sxq123456";
		Properties properties=new Properties();
		properties.setProperty("mail.transport.protocol", "smtp");
		properties.setProperty("mail.smtp.host", "smtp.126.com");
		properties.setProperty("mail.smtp.auth", "true");
		Session session=Session.getInstance(properties);
		session.setDebug(true);
		Message message=new MimeMessage(session);
		// Set From: 头部头字段
		message.setFrom(new InternetAddress(from));
		// Set To: 头部头字段
		message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
		// Set Subject: 头字段
		message.setSubject("This is the SUbject Line!");
		// 设置消息体
		message.setText("hello world");
		// 发送消息
		Transport transport=session.getTransport();
		transport.connect(server,auth_code);
		transport.sendMessage(message, message.getAllRecipients());
		System.out.println("Sent message successfully");
		transport.close();
		
	}	
		
}
