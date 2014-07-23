from django.db import models

# Create your models here.
class Galeria(models.Model):
	"""docstring for Galeria"""
	nombre_galeria  = models.CharField(max_length=15)
	imagen_1 = models.ImageField(upload_to='cargas/')
	descripcion_1 = models.TextField()

	imagen_2= models.ImageField(upload_to='cargas/')
	descripcion_2 = models.TextField()

	imagen_3 = models.ImageField(upload_to='cargas/')
	descripcion_3 = models.TextField()
	

	def __unicode__(self):
		return self.nombre_galeria
