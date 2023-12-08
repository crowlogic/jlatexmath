module jlatexmath
{
  requires java.base;
  requires transitive java.desktop;
  requires transitive java.xml;
  requires transitive xmlgraphics.commons;
  requires transitive fop;

  exports org.scilab.forge.jlatexmath;
  exports org.scilab.forge.jlatexmath.cache;
  exports org.scilab.forge.jlatexmath.cyrillic;
  exports org.scilab.forge.jlatexmath.dynamic;
  exports org.scilab.forge.jlatexmath.greek;

}