package com.dom.domaci5.resource;

import com.dom.domaci5.entity.Post;
import com.dom.domaci5.service.PostService;

import javax.inject.Inject;
import javax.validation.Valid;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/resource-posts")
public class MainResource {

   @Inject
    private PostService postService;

   @GET
   @Produces(MediaType.APPLICATION_JSON)
   public Response all(){return Response.ok(this.postService.allPosts()).build();}

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public Post create(@Valid Post post){return  this.postService.addPost(post);}

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Post find(@PathParam("id") Integer id){
       return this.postService.findPost(id);
    }

    @DELETE
    @Path("/{id}")
    public void delete(@PathParam("id") Integer id){
       this.postService.deletePost(id);
    }


}


