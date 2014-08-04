from django.conf.urls import patterns, include, url
from django.contrib.auth.models import User, Group
from django.contrib import admin
from avenidas.models import Volcan
from rest_framework import viewsets,routers
class UserViewSet(viewsets.ModelViewSet):
    model = User
class GroupViewSet(viewsets.ModelViewSet):
    model = Group
class VolcanViewSet(viewsets.ModelViewSet):
    model = Volcan
router = routers.DefaultRouter()
router.register(r'users', UserViewSet)
router.register(r'groups', GroupViewSet)
router.register(r'volcan',VolcanViewSet)


admin.autodiscover()
urlpatterns = patterns('',
    # Examples:
    url(r'^api/', include(router.urls)),
    url(r'^$', 'ciudades.views.home', name='home'),
    # url(r'^blog/', include('blog.urls')),
   # url(r'^$admin/logo_Espe.png', include(admin.site.urls)),
    url(r'^admin/', include(admin.site.urls)),
    url(r'^api-auth/',include('rest_framework.urls',namespace='rest_framework')),
)
