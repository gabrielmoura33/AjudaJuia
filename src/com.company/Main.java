package com.company;
import java.io.IOException;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        //Toda classe main que for  armazenar um arquivo, tem que ter o Throws IOExcepion

       try {
           UsuarioDAO usuarioDAO =  null;
           usuarioDAO = new UsuarioDAO("usuarios.bin"); //Aqui voce passa o nome do arquivo binario que será criado.
           var usuario = new Usuario();

           usuario.setNome("Gabriel");
           usuario.setCpf("11562566392");
           usuario.setEmail("gabrielmoura.music@gmail.com");
           usuario.setTelefone("(31)99203-1067");
           usuario.setId(1);
           //Primeiro voce cria um usuario, normalmente, como é comum em toda aplicação.


           usuarioDAO.add(usuario);

           usuario.setNome("Julia");
           usuario.setCpf("2132131232");
           usuario.setEmail("julia.teste@gmail.com");
           usuario.setTelefone("(31)98891-123");
           usuario.setId(2);

           usuarioDAO.add(usuario);

           List<Usuario> listaDeUsuarios;

           listaDeUsuarios = usuarioDAO.getAll();

           for (Usuario user : listaDeUsuarios) {
               System.out.println(user.getId());
               System.out.println(user.getNome());
               System.out.println(user.getEmail());
               System.out.println(user.getCpf());
           }

       } catch (Exception e) {
           System.out.println("Erro Ao Conectar com Arquivo de Auditorias");
       }

    }
}
