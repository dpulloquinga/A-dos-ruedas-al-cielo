from django.db import models

# Create your models here.
class Ruta(models.Model):
	"""docstring for Ruta"""
	nombre = models.CharField(max_length=20)
	origen = models.CharField(max_length=20)
	destino = models.CharField(max_length=20)
	tiempo = models.PositiveSmallIntegerField()
	imagen = models.ImageField(upload_to='cargas/rutas/')
	def __unicode__(self):
		return self.nombre