from django.db import models
from rutas.models import Ruta
from guias.models import Guia
from galerias.models import Galeria
from hospedajes.models import Hospedaje
from ciudades.models import Ciudad
class Volcan(models.Model):
	nombre = models.CharField(max_length=25)
	altitud = models.PositiveIntegerField()
	riesgo = models.CharField(max_length=8)
	foto = models.ImageField(upload_to='cargas/volcanes/')
	descripcion = models.TextField()
	rutas = models.ForeignKey(Ruta)
	guias = models.ManyToManyField(Guia)	
	galerias = models.OneToOneField(Galeria)
	hospedaje = models.ManyToManyField(Hospedaje)
	ciudad = models.OneToOneField(Ciudad)
	def __unicode__(self):
		return self.nombre