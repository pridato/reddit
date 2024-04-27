<script lang="ts">
  export let seleccionado:boolean = false
  console.log(seleccionado)
</script>

{#if seleccionado}
    <!-- " ^ " -->
    <svg xmlns="http://www.w3.org/2000/svg" class="mr-2 icon icon-tabler icon-tabler-chevron-up" width="20" height="20" viewBox="0 0 24 24" stroke-width="1.5" stroke="#ffffff" fill="none" stroke-linecap="round" stroke-linejoin="round">
      <path stroke="none" d="M0 0h24v24H0z" fill="none"/>
      <path d="M6 15l6 -6l6 6" />
    </svg>
    {:else}
    <!-- icono hacia abajo-->
      <svg class="text-white mr-2" fill="currentColor" height="20" viewBox="0 0 20 20" width="20" xmlns="http://www.w3.org/2000/svg">
        <path d="M10 13.125a.624.624 0 0 1-.442-.183l-5-5 .884-.884L10 11.616l4.558-4.558.884.884-5 5a.624.624 0 0 1-.442.183Z"></path>
      </svg>
    {/if}

