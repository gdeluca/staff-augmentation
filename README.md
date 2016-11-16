### staff augmentation
requiere java 8 y maven instalado

El ejecutable es HandleStaffProfiles, los resultados se ven por consola.

* mvn clean install
* mvn exec:java -Dexec.mainClass=" bdev.staff.HandleStaffProfiles"
 
Segun los requerimientos, los pasos son:  
Abrir el archivo adjunto y parsear la informacion.
Seleccionar los perfiles en base a algun criterio, los criterios que me parecen importantes son title y role para identificar un rol relacionado al staff : ej: 'RRHH' y  un pais  de offshore, distinto de 'argentina'
Enviar los mails esta fuera del scope del test y Linkedin resguarda la informacion del mail, al no estar expuesto no seria posible el envio de mail con un servicio externo a linkedin.

Algunas posibles mejoras podrian ser:
Usar una api de linkedin como spring social(en java) para enviar los mensajes a los usuarios a traves de linkedin (Spring Social Communcation Opertations)
Otra podria ser usar los criterios de busqueda en distintos idiomas.