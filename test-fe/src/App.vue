<script setup>
import {ref, onMounted} from "vue";
import { getItems } from "@/libs/fetchUtils";

const data = ref(null)
onMounted(async () => {
  try {
    data.value = await getItems(
      `${import.meta.env.VITE_APP_URL}/Tb1/all`
    );
  } catch (error) {
    console.log(error);
  }
});

</script>
 
<template>
<div class="bg-white w-screen h-screen">
  <h1 class="text-3xl font-bold underline text-blue-600">
    Hello world!
  </h1>
  <p class="text-black">{{ data }}</p>
</div>
</template>
 
<style scoped>

</style>