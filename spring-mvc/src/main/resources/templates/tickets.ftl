<p>We have these tickets:
<table border=1>
  <#list tickets as ticket>
    <tr><td>${ticket.id}<td>${ticket.title}<td>${ticket.booked?string('yes', 'no')}
  </#list>
</table>