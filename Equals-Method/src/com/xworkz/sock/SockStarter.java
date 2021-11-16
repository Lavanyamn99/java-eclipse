package com.xworkz.sock;

public class SockStarter {

	public static void main(String[] args) {
		Sock sock = new Sock();
		sock.setMaterial(SockMaterial.COTTON);
		sock.setPrice(67);
		sock.setSize('m');
		sock.setType(SockType.CREW);

		Sock sock1 = new Sock();
		sock1.setMaterial(SockMaterial.POLYSTER);
		sock1.setPrice(67);
		sock1.setSize('s');
		sock1.setType(SockType.ANKEL_FIT);

		if (sock == sock1) {
			System.out.println("same memory");
		}
		boolean same = sock.equals(sock1);
		System.out.println(same);

	}

}
