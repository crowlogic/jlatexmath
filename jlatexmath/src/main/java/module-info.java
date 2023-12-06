module jlatexmath
{
  requires transitive java.base;
  requires transitive java.desktop;

  exports org.scilab.forge.jlatexmath;
  exports org.scilab.forge.jlatexmath.cache;
  exports org.scilab.forge.jlatexmath.cyrillic;
  exports org.scilab.forge.jlatexmath.dynamic;
  exports org.scilab.forge.jlatexmath.greek;

}