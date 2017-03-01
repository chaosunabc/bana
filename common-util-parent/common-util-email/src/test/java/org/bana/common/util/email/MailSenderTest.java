/**
 * @Company ������ͨ   
 * @Title: mailSenderTest.java 
 * @Package org.bana.common.util.email 
 * @author Liu Wenjie   
 * @date 2014-8-25 ����11:51:20 
 * @version V1.0   
 */
package org.bana.common.util.email;

import javax.mail.internet.MimeUtility;

import org.apache.commons.mail.EmailAttachment;
import org.apache.commons.mail.HtmlEmail;
import org.apache.commons.mail.MultiPartEmail;
import org.junit.Ignore;
import org.junit.Test;

/**
 * @ClassName: mailSenderTest
 * @Description: �����ʼ��Ļ������͹���
 * 
 */
@Ignore
public class MailSenderTest {

	@Test
	public void testSendHtmlMail() throws Exception {
		// ��Ҫʹ��SimpleEmail,�������������
		HtmlEmail email = new HtmlEmail();
		//email.setSSLOnConnect(true);
		// �����Ƿ��ͷ�����������
		email.setHostName("smtp.qq.com");
		// ���뼯������
		email.setCharset("utf8");
		// �ռ��˵�����
		email.addTo("ganlanshugod@gmail.com", "С��");
		// �����˵�����
		email.setFrom("liuwenjie@jbinfo.cn", "���Ľ�");
		// �����Ҫ��֤��Ϣ�Ļ���������֤���û���-���롣�ֱ�Ϊ���������ʼ��������ϵ�ע�����ƺ�����
		email.setAuthentication("314830496", "victoria0");
		email.setSubject("����Email");
		
		
		email.setHtmlMsg("<img src='http://a.hiphotos.baidu.com/super/whfpf%3D425%2C260%2C50/sign=79955cca0bfa513d51ff3f9e5b5061c9/7a899e510fb30f24aabd2515cb95d143ad4b0385.jpg' ></img> <div style='color:red'>ceshi html</div>");
		// Ҫ���͵���Ϣ
		email.setMsg("<img src='http://a.hiphotos.baidu.com/super/whfpf%3D425%2C260%2C50/sign=79955cca0bfa513d51ff3f9e5b5061c9/7a899e510fb30f24aabd2515cb95d143ad4b0385.jpg' ></img> <div style='color:red'>ceshi html</div>");
		// ����
		email.send();
	}

	@Test
	public void testSendAttashMail() throws Exception {
		MultiPartEmail email = new MultiPartEmail();
		// �����Ƿ��ͷ�����������
		email.setHostName("smtp.gmail.com");
		// ���뼯������
		email.setCharset("utf8");
		// �ռ��˵�����
		email.addTo("liuwenjie@jbinfo.cn", "С��");
		// �����˵�����
		
		email.setFrom("ganlanshugod@gmail.com", "���Ľ�");
		// �����Ҫ��֤��Ϣ�Ļ���������֤���û���-���롣�ֱ�Ϊ���������ʼ��������ϵ�ע�����ƺ�����
		email.setAuthentication("ganlanshugod", "liuwenjie0812");		
		email.setSubject("ͼƬ");
		email.setMsg("��������Ҫ��ͼƬ!");
		
		// Create the attachment
		EmailAttachment attachment = new EmailAttachment();
		attachment.setPath("C:/Users/liuwenjie/Desktop/�����ĵ�.doc");// ָ�������ڱ��صľ���·��
		attachment.setDisposition(EmailAttachment.ATTACHMENT);
		attachment.setDescription("��������");// ��������
		// attachment.setName("����");//��������
		// �����������������������,attachment.setName(MimeUtility.encodeText("����"));
		attachment.setName(MimeUtility.encodeText("�ĵ�����"));
		// Create the email message

		// add the attachment
		email.attach(attachment);
		// send the email
		email.send();
	}
}
