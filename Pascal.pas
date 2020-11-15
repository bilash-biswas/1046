var
a,b,z : int64;
begin
   read(a);
   read(b);
   if(b > a)then
      writeln('O JOGO DUROU ', b - a ,' HORA(S)');
   if(a = b)then
      writeln('O JOGO DUROU 24 HORA(S)');
   if(a > b)then
   begin
      z := 24 - a + b;
      writeln('O JOGO DUROU ', z ,' HORA(S)');
   end
end.
