package com.imona.rbd;


import org.springframework.web.client.RestTemplate;

/**
 * Minimal Device Discovery example.
 */
public class RemoteDeviceDiscovery {

	static Thread thrDiscover;

	public static void main(String[] args) {
		thrDiscover = new Thread(new DiscoverThr());
		thrDiscover.start();
	}
}