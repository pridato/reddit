import { springUrl } from "../globales"
import type { Comunidad } from "../models/comunidad"
import type { Noticia } from "../models/noticia"
import type { Post } from "../models/post"
import type { Usuario } from "../models/usuario"

let usuario:Usuario

/**
 * autentificar el usuario actual
 * @param email 
 * @param password 
 * @returns 
 */
export async function loginRest(email:string, password:string) {

  // leemos los dos valores del input para enviar x fetch a spring
  try {
    // peticion a spring para obtener el usuario
    const response: Response = await fetch(`${springUrl}/Cliente/login?email=${email}&password=${password}`, {
      method: 'GET',
      headers: {
        'Content-Type': 'application/json'
      }
    })
    if(response.ok) {
      usuario = await response.json()
    }

  } catch(error){
    console.log(error)
  }

  return usuario
}

/**
 * 
 * @returns devuelve una lista de las ultimas 5 noticias
 */
export async function getNews() :Promise<Noticia[]>{
  let data:Noticia[] = []
  try {
    // peticion a spring para obtener el usuario
    const response: Response = await fetch(`${springUrl}/get-news`, {
      method: 'GET',
      headers: {
        'Content-Type': 'application/json'
      }
    })
    if(response.ok) {
      data = await response.json()
    }

  } catch(error){
    console.log(error)
  }

  return data
}

/**
 * Metodo para regresar todas las comunidades
 * @returns 
 */
export async function obtenerComunidades() :Promise<Comunidad[]> {
  let data:Comunidad[] = []
  try {
    // peticion a spring para obtener el usuario
    const response: Response = await fetch(`${springUrl}/get-comunidades`, {
      method: 'GET',
      headers: {
        'Content-Type': 'application/json'
      }
    })
    if(response.ok) {
      data = await response.json()
    }

  } catch(error){
    return []
  }

  return data
}

/**
 * Metodo para añadir like o dislike
 * @returns Promise<Post>
 */
  export async function addLikeDislike(id:string, like:boolean) :Promise<Post> {
    let data!:Post
    console.log(`${springUrl}/post/toggle-like?id=${id}&like=${like}`)
    try {
      // peticion a spring para modificar los likes y dislikes
      const response: Response = await fetch(`${springUrl}/post/toggle-like?id=${id}&like=${like}`, {
        method: 'GET',
        headers: {
          'Content-Type': 'application/json'
        }
      })
      if(response.ok) {
        data = await response.json()
      }
  
    } catch(error){
      console.log(error)
    }
  
    return data
  }