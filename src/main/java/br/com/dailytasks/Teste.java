package br.com.dailytasks;

import java.text.SimpleDateFormat;

public class Teste {
    public static void main(String[] args) {
        System.out.println("Hello");
        String data = "dd/MM/yyyy";
        String hora = "hh:mm:ss";
        String data1, hora1;
        java.util.Date agora = new java.util.Date();
        System.out.println(agora);
        SimpleDateFormat formata = new SimpleDateFormat(data);
        data1 = formata.format(agora);
        System.out.println(agora);
        formata = new SimpleDateFormat(hora);
        hora1 = formata.format(agora);
        System.out.println(hora1);
    }
}
