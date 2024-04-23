#include <bits/stdc++.h> 

void merge(Node* head1, Node* head2)
{
    Node* current1=head1;
    Node* current2=head2;
    Node* next1;
    Node* next2;
    while(current1&&current2){
        next1=current1->next;
        next2=current2->next;
        current1->next=current2;
        current2->next=next1;

        current1=next1;
        current2=next2;
    }
}
