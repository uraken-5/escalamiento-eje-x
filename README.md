# escalamiento-eje-x
microservicio con escalamiento horizontal eje x

Este es un proyecto de ejemplo que demuestra cómo implementar el escalamiento en el eje X utilizando Docker para replicar instancias de una aplicación Spring Boot y Nginx como balanceador de carga.

## Requisitos

Asegúrate de tener instalados los siguientes componentes en tu sistema:

- Docker: [Instrucciones de instalación](https://docs.docker.com/get-docker/)
- Git: [Instrucciones de instalación](https://git-scm.com/book/en/v2/Getting-Started-Installing-Git)

## Estructura del Proyecto

El proyecto consta de los siguientes archivos:

- `Dockerfile`: Archivo para crear la imagen de Docker de la aplicación Spring Boot.
- `nginx.conf`: Archivo de configuración para Nginx que define el balanceador de carga.
