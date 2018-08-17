package com.caiolacerda.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import com.caiolacerda.cursomc.domain.Pedido;

public interface EmailService {
	void sendOrderConfirmationEmail(Pedido obj);

	void sendEmail(SimpleMailMessage msg);
}
