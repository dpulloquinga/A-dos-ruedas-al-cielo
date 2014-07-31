from django.db import models

# Create your models here.
class Usuario(models.Model):
	nickname = models.CharField(max_length=25)
	password = models.CharField(max_length=10)
	email = models.EmailField(max_length=25)
	nombre = models.CharField(max_length=10)
	apellido = models.CharField(max_length=10)
	def __unicode__(self):
		nick = self.nickname+" Nombres: "+self.nombre+" "+self.apellido
		return self.nickname
		