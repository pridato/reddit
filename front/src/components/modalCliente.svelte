<script lang="ts">
  import { loginRest } from '../services/peticiones'
  import type { Usuario } from "../models/usuario"
  import { _usuario } from '../services/estadoGlobal'

  export let closeModal: () => void;

  async function login() {

    const email = document.querySelector("#email") as HTMLInputElement
    const password = document.querySelector("#password") as HTMLInputElement

    let usuario:Usuario = await loginRest(email.value, password.value)
    // actualizamos estado general de loggedIn
    _usuario.update((data) => (data = usuario))
    closeModal()
  }

  

</script>

<div class="rounded-lg p-8 w-fit h-fit fixed inset-auto bg-[#0E1A1C] text-white flex flex-col justify-center items-center">
  
  <!-- button x close modal-->
  <button on:click={closeModal} id="close-modal" class="absolute top-10 right-10 p-2 bg-[#1A282D] rounded-full">
    <svg xmlns="http://www.w3.org/2000/svg" class="icon icon-tabler icon-tabler-x" width="24" height="24" viewBox="0 0 24 24" stroke-width="1.5" stroke="#ffffff" fill="none" stroke-linecap="round" stroke-linejoin="round">
      <path stroke="none" d="M0 0h24v24H0z" fill="none"/>
      <path d="M18 6l-12 12" />
      <path d="M6 6l12 12" />
    </svg>
  </button>

  <div class="flex flex-col justify-center items-start">
    <h1 class="mt-14 text-2xl font-bold">Iniciar sesión</h1>

  <span class="text-gray-600">
    Al continuar, aceptas nuestro <span class="text-blue-700 cursor-pointer">Acuerdo del usuario </span> y <br/>
    confirmas que has entendido la <span class="text-blue-700 cursor-pointer">Política de privacidad</span>.
  </span>

  <!-- botones login google y apple-->
  <div class="mt-10 grid space-y-4 w-full">

    <button class="group h-12 px-6 border-2 border-gray-300 rounded-full transition duration-300 hover:border-blue-400 focus:bg-blue-50 active:bg-blue-100">
        <div class="relative flex items-center space-x-4 justify-center">
            <img src="https://www.svgrepo.com/show/475656/google-color.svg" class="absolute left-0 w-5" alt="google logo">
            <span class="pl-5 block w-max font-semibold tracking-wide text-gray-700 dark:text-white text-sm transition duration-300 group-hover:text-blue-600 sm:text-base">
              Continuar con Google
            </span>
        </div>
    </button>

    <button class="group h-12 px-6 border-2 border-gray-300 rounded-full transition duration-300 hover:border-blue-400 focus:bg-blue-50 active:bg-blue-100">
        <div class="relative flex items-center space-x-4 justify-center">
            <svg xmlns="http://www.w3.org/2000/svg" fill="currentColor" class="absolute left-0 w-5 text-gray-700" viewBox="0 0 16 16">
                <path d="M8 0C3.58 0 0 3.58 0 8c0 3.54 2.29 6.53 5.47 7.59.4.07.55-.17.55-.38 0-.19-.01-.82-.01-1.49-2.01.37-2.53-.49-2.69-.94-.09-.23-.48-.94-.82-1.13-.28-.15-.68-.52-.01-.53.63-.01 1.08.58 1.23.82.72 1.21 1.87.87 2.33.66.07-.52.28-.87.51-1.07-1.78-.2-3.64-.89-3.64-3.95 0-.87.31-1.59.82-2.15-.08-.2-.36-1.02.08-2.12 0 0 .67-.21 2.2.82.64-.18 1.32-.27 2-.27.68 0 1.36.09 2 .27 1.53-1.04 2.2-.82 2.2-.82.44 1.1.16 1.92.08 2.12.51.56.82 1.27.82 2.15 0 3.07-1.87 3.75-3.65 3.95.29.25.54.73.54 1.48 0 1.07-.01 1.93-.01 2.2 0 .21.15.46.55.38A8.012 8.012 0 0 0 16 8c0-4.42-3.58-8-8-8z">
                </path>
            </svg>
            <span class="pl-5 block w-max font-semibold tracking-wide text-gray-700 text-sm transition dark:text-white duration-300 group-hover:text-blue-600 sm:text-base">
              Continuar con Github
            </span>
        </div>
    </button>
  </div>
  <!-- FIN botones login google y apple-->

  <!-- formulario correo y contraseña -->
  <form action="" class="my-14 flex flex-col gap-y-5 justify-center items-center w-full">
    <input class="bg-[#1A282D] w-full py-2 p-2 rounded-2xl" type="email" name="" id="email" placeholder="Correo electrónico ">
    <input class="bg-[#1A282D] w-full py-2 p-2 rounded-2xl" type="password" name="" id="password" placeholder="Contraseña ">
  </form>

  <!-- opciones recuperar password y registro-->

  <span class="text-blue-700 cursor-pointer">¿Has olvidado tu contraseña?</span>
  <div class="flex justify-center items-center">
    <span>¿Es tu primera vez en Reddit? </span>
    <span class="text-blue-700 cursor-pointer pl-2">Regístrate</span>
  </div>

  <!-- boton iniciar sesion-->
  <button on:click={login} class="w-full bg-[#222829] p-3 rounded-xl mt-10">Iniciar sesión</button>

  </div>
  
</div>

