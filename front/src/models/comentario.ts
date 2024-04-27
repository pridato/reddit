export interface Comentario {
  id:string,
  contenido: string,
  fecha: Date,
  usuario_id: string,
  respuestas: string[] // id de otros comentarios,
  // si el comentario está respondiendo tendrá un padre
  comentarios_padres: string[] 
}