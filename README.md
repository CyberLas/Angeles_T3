# Entendiendo RecyclerView

> Proyecto dedicado a entender mejor como funciona un RecyclerView y su adaptador


![Imagen del Proyecto](https://i.imgur.com/9o8r3wX.jpg)

## Descripcion

Un simple proyecto explicando paso a paso como crear un RecyclerView, como poblarlo y utilizar onClickListener en cada uno de sus elementos

#### Contenidos

- Creacion de RecyclerView
- Utilizar vistas para cada elemento de la lista
- Como bindear datos en cada vista
- Utilizando una interfaz para poder crear un onClickListener en cada elemento del Recycler
- Crear Toasts que no se encolen si se clican muchas veces distintos elementos
- Añadiendo divider para cada elemento

Este proyecto se va a seguir actualizando para lograr entender al maximo RecyclerView y su Adaptador, añadiendo en cada commit una funcionalidad nueva.

## Como utilizarlo

- Se debe importar la ultima version de RecyclerView en nuestro BuildGradle(Module App)
- Creamos RecyclerView en nuestra Layout
- Creamos el listItem ( donde pondremos que elementos mostrar dentro de cada vista) y nuestro ViewHolder
- Utilizamos onBindViewHolder para poblar de informacion nuestras vistas dentro del RecyclerView
- Añadimos y configuramos el Adaptador de nuestro RecyclerView
- Añadimos un LayoutManager para conectar todo

## Version

Actualmente version v1.00
