<script lang="ts">
  import DirectionNavbar from "./iconsSvelte/directionNavbar.svelte";

  let temasSeleccionado:boolean = false
  let recursosSeleccionado:boolean = false
</script>
<!-- svelte-ignore a11y-click-events-have-key-events -->
  <!-- svelte-ignore a11y-no-noninteractive-element-interactions -->
<ul class="text-[#5F6F73] mx-5 flex flex-col gap-y-5 ml-10">
  <!-- opciones menu -->

  <li on:click={() => temasSeleccionado = !temasSeleccionado} class="flex flex-row justify-between items-center p-2 rounded-lg cursor-pointer hover:bg-[#1A282D]">
    <span>TEMAS</span>
    <DirectionNavbar seleccionado={temasSeleccionado}/>
  </li>

  <li on:click={() => recursosSeleccionado = !recursosSeleccionado} class="flex flex-row justify-between items-center p-2 rounded-lg cursor-pointer hover:bg-[#1A282D] ">
    <span>RECURSOS</span>
    <DirectionNavbar seleccionado={recursosSeleccionado}/>
  </li>
</ul>