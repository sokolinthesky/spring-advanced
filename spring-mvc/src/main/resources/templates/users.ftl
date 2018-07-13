<p>We have these users:
<table border=1>
  <#list users as user>
    <tr><td>${user.id}<td>${user.name}<td>${user.email}
  </#list>
</table>