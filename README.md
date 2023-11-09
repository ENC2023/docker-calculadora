# Proyecto - Java Calculadora con Pruebas - Maven

Plantilla básica para proyecto de Java usando Maven

# Diagrama de clases
[Editor en línea](https://mermaid.live/)
```mermaid
---
title: Calculadora
---
classDiagram
      class Calculadora
      Calculadora: -x
      Calculadora: -y
      Calculadora: +suma()
      Calculadora: +resta()
      Calculadora: +multiplica()
      Calculadora: +divide()
```
[Referencia-Mermaid](https://mermaid.js.org/syntax/classDiagram.html)

## Diagrama de clases UML con draw.io
El repositorio está configurado para crear Diagramas de clases UML con ```draw.io```. Para usarlo simplemente agrega un archivo con extensión ```.drawio.png```, das doble clic sobre el mismo y se activará el editor ```draw.io``` incrustado en ```VSCode``` para edición. Asegúrate de agregar las formas UML en el menú de formas del lado izquierdo (opción ```+Más formas```).

## Uso del proyecto con Maven

### Compilar
```
mvn -f app compile
```
### Probar N tests
```
mvn -f app test
```
### Probar 1 test
```
mvn -f app test -Dtest="AppTest#testSuma"
mvn -f app test -Dtest="AppTest#testResta"
mvn -f app test -Dtest="AppTest#testMultiplica"
mvn -f app test -Dtest="AppTest#testDivide"
``` 
### Ejecutar App
```
java -cp app/target/classes miPrincipal.App
```
### Empacar App
```
mvn -f app package
```
### Ejecutar App empacada
```
java -cp app/target/app-1.0-SNAPSHOT.jar miPrincipal.App
```
### Limpiar binarios
```
mvn -f app clean
```
# Docker
### Construyendo imagen local Docker
```
docker build -t japp .
```
### Levantando el contenedor Docker-Java a partir de la imagen creada localmente
```
docker run -it japp
```
### Subiendo la imagen al Docker Hub
```
docker tag local-image:tagname new-repo:tagname
docker push new-repo:tagname
```

### Ejemplo
```
docker tag japp:latest ricardoqm/calculadora:latest
docker push ricardoqm/calculadora:latest
```
### Levantando el contenedor Docker-Java a partir de la imagen disponible en Docker Hub
```
docker run -it ricardoqm/calculadora:latest
```
## Comandos Git-Cambios y envío a Autograding

### Por cada cambio importante que haga, actualice su historia usando los comandos:
```
git add .
git commit -m "Descripción del cambio"
```
### Envíe sus actualizaciones a GitHub para Autograding con el comando:
```
git push origin main
```
