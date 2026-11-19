# Write your MySQL query statement below
select date_id,make_name, Count(DISTINCT LEAD_ID) as unique_leads,
count(Distinct partner_id) as unique_partners from dailysales group by date_id, make_name;