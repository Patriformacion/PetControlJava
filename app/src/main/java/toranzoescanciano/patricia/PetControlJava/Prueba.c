//Prueba de código en C por Triiis21
#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>

char  ft_hello(char c)
{
  write(1, c, 1);
}

void main (void)
{
  char c;

  c = 'Hello, World!';
  return (0);
}
