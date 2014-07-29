from django.conf.urls import patterns, include, url

from django.contrib import admin
admin.autodiscover()

urlpatterns = patterns('',
    # Examples:
    url(r'^$', 'ciudades.views.home', name='home'),
    # url(r'^blog/', include('blog.urls')),
   # url(r'^$admin/logo_Espe.png', include(admin.site.urls)),
    url(r'^admin/', include(admin.site.urls)),
)
