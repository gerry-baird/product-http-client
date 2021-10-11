package com.gerry.product.client;

public class Runner {
    public static void main(String[] args) {

        HttpClient client = new HttpClient();
        try{
            client.getProductById("W1001");
        }catch (Exception e){
            System.out.println(e);
        }


    }
}
