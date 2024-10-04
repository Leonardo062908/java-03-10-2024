package br.com.fiap;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.time.LocalDate;

@Path("alunos")
public class AlunoResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response recuperaAluno () {
        Aluno aluno = new Aluno();
        aluno.setNome("Leonardo Teixeira");
        aluno.setRm(556629);
        aluno.setDataAdmissao(LocalDate.of(2010, 2, 1));
        aluno.setEmail("rm556629@fiap.com.br");
        return Response.ok(aluno).build();
    }
}
