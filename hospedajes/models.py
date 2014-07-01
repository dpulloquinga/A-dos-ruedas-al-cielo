from django.db import models

# Create your models here.
class Hospedaje(models.Model):
	"""docstring for Ciudad"""
	nombre = models.CharField(max_length=25)
	descripcion = models.TextField()
	costo = models.PositiveSmallIntegerField()
	telefono = models.PositiveIntegerField()
	direccion = models.CharField(max_length=25)
	imagen =  models.ImageField(upload_to='cargas/ciudades/')

	def __unicode__(self):
		return self.nombre