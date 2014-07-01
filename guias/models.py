from django.db import models

# Create your models here.
class Guia(models.Model):
	nombre = models.CharField(max_length=15)
	apellido = models.CharField(max_length=15)
	fecha_nacimiento = models.DateField()
	cedula = models.PositiveIntegerField()
	genero = models.CharField(max_length=15)
	antiguedad = models.PositiveSmallIntegerField()
	email = models.EmailField()
	telefono = models.PositiveIntegerField()
	foto = models.ImageField(upload_to='cargas/')

	descripcion = models.TextField()
	def __unicode__(self):
		return self.name