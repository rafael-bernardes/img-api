package br.gov.bom_destino.img_api.rest;

import java.io.Serializable;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.jboss.resteasy.client.jaxrs.ResteasyClient;

@Path("dados-geograficos")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class DadosGeograficosResource implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private ResteasyClient client;
	
	@GET
	public Response getIBGEData() {
		return Response.ok("funcionou!").build();
	}
}