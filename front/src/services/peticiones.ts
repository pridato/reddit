import { springUrl } from "../globales"
import type { Usuario } from "../models/usuario"

let usuario:Usuario

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