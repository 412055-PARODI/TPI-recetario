package com.bdii.recetario.Model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.Data;

@Document(collection = "recetas")
@Data
public class Receta {
    @Id
    private String id;
    private String titulo;
    private String autor; // puede ser el ID del usuario
    private List<String> ingredientes;
    private List<String> pasos;
    private List<Comentario> comentarios;
    private List<String> favoritos; // lista de IDs de usuarios que la marcaron   
    }
