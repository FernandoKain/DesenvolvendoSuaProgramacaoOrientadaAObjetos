package poo_model;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class EntregaCartaoApp {

    public static void main(String[] args) {

        Endereco endereco = new Endereco();
        //endereco.cep = "00000000";
        //Dados do endereço

        Cliente cliente = new Cliente();
        //Dados do cliente

        try{
            cliente.adicionaEndereco(endereco);
            System.out.println("Endereço adicionado com sucesso!");
        }catch (Exception e){
            System.err.println("Houve um erro ao adicionar o endereço." +e.getMessage());
        }

        cliente.adicionaEndereco(endereco);
        System.out.println("Endereço adicionado com sucesso!");
        }
    }

