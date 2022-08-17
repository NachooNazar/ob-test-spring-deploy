## Despliegue de app spring boot en heroku

Crear archivo `system.properties` en el proyecto:

```
java.runtime.version=18
```

1. Crear cuentas github y heroku
2. Tener configurado git en la pc
3. Subir el proyecto a github desde IntelliJ IDEA desde opc VCS > Github > share project
4. Desde heroku, crear app y elegir el metodo github, luego buscar el repo
5. Habilitar deply automatico y ejecutar deploy