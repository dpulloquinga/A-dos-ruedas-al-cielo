from django.db import models
from rutas.models import Ruta
from guias.models import Guia
from galerias.models import Galeria
from hospedajes.models import Hospedaje
from ciudades.models import Ciudad
class Volcan(models.Model):
	name = models.CharField(max_length=25)
	altitud = models.PositiveIntegerField()
	riesgo = models.CharField(max_length=8)
	foto = models.ImageField(upload_to='cargas/')
	descripcion = models.TextField()
	rutas = models.ForeignKey(Ruta)
	guias = models.ManyToManyField(Guia)	
	galerias = models.ForeignKey(Galeria)
	hospedaje = models.ManyToManyField(Hospedaje)
	ciudad = models.ManyToManyField(Ciudad)
	def __unicode__(self):
		return self.name