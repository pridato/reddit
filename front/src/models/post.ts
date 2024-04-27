export interface Post {
  id: string,
  nombre: string,
  comentarios: string[],
  like:  number,
  dislike: number,
  fecha_publicacion: Date,
  id_comunidad: string,
  id_usuario: string
}