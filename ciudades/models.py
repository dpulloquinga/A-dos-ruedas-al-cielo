from django.db import models

# Create your models here.
class Ciudad(models.Model):
	nombre = models.CharField(max_length=25)
	description = models.TextField()
	poblacion = models.CharField(max_length=10)
	bandera = models.ImageField(upload_to='cargas/ciudades/')
	imagen =  models.ImageField(upload_to='cargas/ciudades/')
	def __unicode__(self):
		return self.nombre-