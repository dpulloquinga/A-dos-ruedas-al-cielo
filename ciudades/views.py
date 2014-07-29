from django.shortcuts import render
from django.http import HttpResponse
import datetime
from django.template import RequestContext,loader
from django.shortcuts import render_to_response
# Create your views here.
def home(request):
	now = datetime.datetime.now()
	html = "<html><body>La hora es %s.</body></html>" %now
	return HttpResponse(html)