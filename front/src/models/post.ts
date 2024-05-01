export interface Post {
  id: string,
  nombre: string,
  cuerpo: string,
  comentarios: string[],
  imagen: string,
  likes:  number,
  dislikes: number,
  fecha_publicacion: Date,
  id_comunidad: string,
  id_usuario: string
}