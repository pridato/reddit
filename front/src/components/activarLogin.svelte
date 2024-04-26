<script lang="ts">

  let isModalOpen = false;
  // onMount para cuando el comp. se ha creado
  import { onMount } from 'svelte';
  import ModalCliente from './modalCliente.svelte';

  onMount(()=> {
    const loginButton = document.querySelector('#login')

    loginButton?.addEventListener( 'click', () => {
      isModalOpen = true
    })
  })

</script>

<button id="login" class="rounded-2xl px-4 py-2 bg-[#D93A00]">
  Iniciar sesión
</button>

<!-- modal-->
{#if isModalOpen}
  <div class="fixed top-0 left-0 w-full h-full flex justify-center items-center bg-gray-800 bg-opacity-50">
    <ModalCliente closeModal={() => isModalOpen = false} />
  </div>
{/if}