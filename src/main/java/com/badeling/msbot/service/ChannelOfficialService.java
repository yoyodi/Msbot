package com.badeling.msbot.service;

import org.springframework.stereotype.Service;

@Service
public interface ChannelOfficialService {

	String receive(String msg);

}
