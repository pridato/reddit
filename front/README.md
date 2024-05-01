# Clon de Reddit con MongoDB, Astro, Spring y Svelte

Este proyecto es un clon simplificado de Reddit, desarrollado utilizando MongoDB como base de datos, Spring Boot para el backend, Astro para el frontend y Svelte para la interfaz de usuario.

## Instalación

1. Clona este repositorio en tu máquina local:

    ```
    git clone https://github.com/tu_usuario/reddit-clone.git
    ```

2. Navega al directorio del proyecto:

    ```
    cd reddit-clone
    ```

3. Navega al directorio del cliente frontend:

    ```
    cd client
    ```

4. Instala las dependencias del cliente frontend:

    ```
    npm install
    ```

## Configuración

1. Asegúrate de tener MongoDB instalado y en funcionamiento en tu máquina local. Puedes descargar MongoDB [aquí](https://www.mongodb.com/try/download/community).

2. Asegúrate de tener Spring Boot instalado en tu máquina local. Puedes descargarlo [aquí](https://spring.io/projects/spring-boot).

3. Crea una base de datos MongoDB y configura las credenciales necesarias en el archivo de configuración del servidor backend (`src/main/resources/application.properties`).

## Uso

1. Inicia el servidor backend Spring Boot desde la raíz del proyecto:

    ```
    mvn spring-boot:run
    ```

   El servidor backend se ejecutará en el puerto 8080 por defecto.

2. En otra terminal, inicia el cliente frontend desde el directorio `client`:

    ```
    pnpm run dev
    ```

   El cliente frontend se ejecutará en el puerto 4321 por defecto.

3. Abre tu navegador web y ve a `http://localhost:4321` para ver la aplicación en acción.

## Contribución

¡Las contribuciones son bienvenidas! Si tienes ideas de mejora, nuevas características que agregar o encuentras errores, no dudes en abrir un problema o enviar una solicitud de extracción.

## Licencia

Este proyecto está bajo la Licencia MIT. Consulta el archivo [LICENSE](LICENSE) para obtener más detalles.


¡Gracias por tu interés en este proyecto! Espero que te resulte útil y divertido.
