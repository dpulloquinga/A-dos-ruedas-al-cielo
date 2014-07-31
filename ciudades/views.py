from django.template import Context
from django.http import HttpResponse
import datetime
from django.template.loader import get_template
from django.shortcuts import render_to_response
# Create your views here.
def home(request):
	now = datetime.datetime.now()
	t = get_template("index.html")
	c = Context()
	html = t.render(c)
	return HttpResponse(html)