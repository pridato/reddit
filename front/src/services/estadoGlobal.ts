import { writable } from "svelte/store";
import type { Usuario } from "../models/usuario"

let usuario!:Usuario
export const _usuario = writable(usuario)